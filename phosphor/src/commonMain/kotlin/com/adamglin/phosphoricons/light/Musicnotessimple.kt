package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.MusicNotesSimple: ImageVector
    get() {
        if (_musicNotesSimple != null) {
            return _musicNotesSimple!!
        }
        _musicNotesSimple = Builder(name = "MusicNotesSimple", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.69f, 19.27f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.15f, -1.09f)
                lineToRelative(-128.0f, 32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 74.0f, 56.0f)
                lineTo(74.0f, 170.11f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 86.0f, 196.0f)
                lineTo(86.0f, 60.68f)
                lineToRelative(116.0f, -29.0f)
                lineTo(202.0f, 138.11f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 214.0f, 164.0f)
                lineTo(214.0f, 24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 211.69f, 19.27f)
                close()
                moveTo(52.0f, 218.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 52.0f, 218.0f)
                close()
                moveTo(180.0f, 186.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 180.0f, 186.0f)
                close()
            }
        }
        .build()
        return _musicNotesSimple!!
    }

private var _musicNotesSimple: ImageVector? = null
