package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.MusicNoteSimple: ImageVector
    get() {
        if (_musicNoteSimple != null) {
            return _musicNoteSimple!!
        }
        _musicNoteSimple = Builder(name = "MusicNoteSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 184.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 184.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.3f, 56.34f)
                lineToRelative(-80.0f, -24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 40.0f)
                verticalLineTo(148.26f)
                arcTo(48.0f, 48.0f, 0.0f, true, false, 136.0f, 184.0f)
                verticalLineTo(50.75f)
                lineToRelative(69.7f, 20.91f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 4.6f, -15.32f)
                close()
                moveTo(88.0f, 216.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 88.0f, 216.0f)
                close()
            }
        }
        .build()
        return _musicNoteSimple!!
    }

private var _musicNoteSimple: ImageVector? = null
