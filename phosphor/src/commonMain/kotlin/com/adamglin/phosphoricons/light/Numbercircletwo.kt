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

public val LightGroup.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) {
            return _numberCircleTwo!!
        }
        _numberCircleTwo = Builder(name = "NumberCircleTwo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(152.0f, 122.05f)
                lineTo(116.0f, 170.05f)
                horizontalLineToRelative(36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(104.0f, 182.05f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.8f, -9.6f)
                lineToRelative(43.17f, -57.56f)
                arcTo(18.0f, 18.0f, 0.0f, true, false, 111.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.31f, -4.0f)
                arcTo(30.0f, 30.0f, 0.0f, true, true, 152.0f, 122.05f)
                close()
            }
        }
        .build()
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
