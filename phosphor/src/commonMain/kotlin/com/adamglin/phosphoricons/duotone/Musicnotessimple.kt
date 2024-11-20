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

public val DuotoneGroup.MusicNotesSimple: ImageVector
    get() {
        if (_musicNotesSimple != null) {
            return _musicNotesSimple!!
        }
        _musicNotesSimple = Builder(name = "MusicNotesSimple", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 164.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 208.0f, 164.0f)
                close()
                moveTo(52.0f, 168.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 52.0f, 168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.92f, 17.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.86f, -1.45f)
                lineToRelative(-128.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 56.0f)
                lineTo(72.0f, 166.08f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 88.0f, 196.0f)
                lineTo(88.0f, 62.25f)
                lineToRelative(112.0f, -28.0f)
                verticalLineToRelative(99.83f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 216.0f, 164.0f)
                lineTo(216.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 212.92f, 17.69f)
                close()
                moveTo(52.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 52.0f, 216.0f)
                close()
                moveTo(180.0f, 184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 180.0f, 184.0f)
                close()
            }
        }
        .build()
        return _musicNotesSimple!!
    }

private var _musicNotesSimple: ImageVector? = null
