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

public val ThinGroup.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) {
            return _numberCircleThree!!
        }
        _numberCircleThree = Builder(name = "NumberCircleThree", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(156.0f, 152.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -54.86f, 22.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.72f, -5.6f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 124.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.28f, -6.29f)
                lineTo(144.32f, 88.0f)
                lineTo(104.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.28f, 6.29f)
                lineTo(131.12f, 120.8f)
                arcTo(32.06f, 32.06f, 0.0f, false, true, 156.0f, 152.0f)
                close()
            }
        }
        .build()
        return _numberCircleThree!!
    }

private var _numberCircleThree: ImageVector? = null
