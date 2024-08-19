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

public val ThinGroup.Basket: ImageVector
    get() {
        if (_basket != null) {
            return _basket!!
        }
        _basket = Builder(name = "Basket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 120.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(181.2f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.38f, 3.58f)
                lineToRelative(-5.6f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 174.8f, 180.0f)
                lineToRelative(0.41f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -3.6f)
                lineToRelative(5.6f, -56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 181.2f, 116.0f)
                close()
                moveTo(74.8f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 4.38f)
                lineToRelative(5.6f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 3.6f)
                lineToRelative(0.41f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, -4.38f)
                lineToRelative(-5.6f, -56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 74.8f, 116.0f)
                close()
                moveTo(236.0f, 88.53f)
                lineTo(220.89f, 201.59f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 209.0f, 212.0f)
                lineTo(47.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.89f, -10.41f)
                lineTo(20.0f, 88.53f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 21.0f, 85.37f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 24.0f, 84.0f)
                lineTo(70.18f, 84.0f)
                lineTo(125.0f, 21.37f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.0f, 0.0f)
                lineTo(185.82f, 84.0f)
                lineTo(232.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, 1.37f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 88.53f)
                close()
                moveTo(80.82f, 84.0f)
                horizontalLineToRelative(94.36f)
                lineTo(128.0f, 30.07f)
                close()
                moveTo(227.43f, 92.0f)
                lineTo(28.57f, 92.0f)
                lineTo(43.0f, 200.53f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 47.0f, 204.0f)
                lineTo(209.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -3.47f)
                close()
            }
        }
        .build()
        return _basket!!
    }

private var _basket: ImageVector? = null
