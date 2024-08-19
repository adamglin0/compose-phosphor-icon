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

public val LightGroup.Numbercircleone: ImageVector
    get() {
        if (_numbercircleone != null) {
            return _numbercircleone!!
        }
        _numbercircleone = Builder(name = "Numbercircleone", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(138.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(126.0f, 91.21f)
                lineTo(111.33f, 101.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.66f, -10.0f)
                lineToRelative(24.0f, -16.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 138.0f, 80.0f)
                close()
            }
        }
        .build()
        return _numbercircleone!!
    }

private var _numbercircleone: ImageVector? = null
