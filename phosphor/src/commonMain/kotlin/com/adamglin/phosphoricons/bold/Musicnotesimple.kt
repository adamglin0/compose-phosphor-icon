package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.MusicNoteSimple: ImageVector
    get() {
        if (_musicNoteSimple != null) {
            return _musicNoteSimple!!
        }
        _musicNoteSimple = Builder(name = "MusicNoteSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.45f, 52.51f)
                lineToRelative(-80.0f, -24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 40.0f)
                verticalLineTo(140.22f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 140.0f, 184.0f)
                verticalLineTo(56.13f)
                lineToRelative(64.55f, 19.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 6.9f, -23.0f)
                close()
                moveTo(88.0f, 212.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 88.0f, 212.0f)
                close()
            }
        }
        .build()
        return _musicNoteSimple!!
    }

private var _musicNoteSimple: ImageVector? = null
