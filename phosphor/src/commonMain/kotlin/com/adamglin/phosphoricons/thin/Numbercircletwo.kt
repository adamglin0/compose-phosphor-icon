package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) {
            return _numberCircleTwo!!
        }
        _numberCircleTwo = Builder(name = "NumberCircleTwo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(150.36f, 120.85f)
                lineTo(112.0f, 172.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(104.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, -6.4f)
                lineTo(144.0f, 116.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 140.0f, 88.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 112.0f, 92.0f)
                arcToRelative(20.08f, 20.08f, 0.0f, false, false, -2.89f, 5.37f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.55f, -2.66f)
                arcToRelative(28.19f, 28.19f, 0.0f, false, true, 4.0f, -7.52f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 44.72f, 33.7f)
                close()
            }
        }
        .build()
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
