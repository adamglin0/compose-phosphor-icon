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

public val LightGroup.Contactlesspayment: ImageVector
    get() {
        if (_contactlesspayment != null) {
            return _contactlesspayment!!
        }
        _contactlesspayment = Builder(name = "Contactlesspayment", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(95.31f, 101.2f)
                arcToRelative(57.37f, 57.37f, 0.0f, false, true, 0.0f, 53.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.62f, -5.6f)
                arcToRelative(44.75f, 44.75f, 0.0f, false, false, 0.0f, -42.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 10.62f, -5.6f)
                close()
                moveTo(143.17f, 66.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.46f, 8.12f)
                arcToRelative(112.67f, 112.67f, 0.0f, false, true, 0.0f, 106.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.58f, 5.66f)
                arcToRelative(124.65f, 124.65f, 0.0f, false, false, 0.0f, -117.66f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 143.17f, 66.71f)
                close()
                moveTo(115.17f, 82.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.48f, 8.12f)
                arcToRelative(79.0f, 79.0f, 0.0f, false, true, 0.0f, 74.36f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.6f, 5.64f)
                arcToRelative(91.0f, 91.0f, 0.0f, false, false, 0.0f, -85.64f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 115.18f, 82.7f)
                close()
                moveTo(230.0f, 128.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, true, 128.0f, 26.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, true, 230.0f, 128.0f)
                close()
                moveTo(218.0f, 128.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, false, -90.0f, 90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, false, 218.0f, 128.0f)
                close()
            }
        }
        .build()
        return _contactlesspayment!!
    }

private var _contactlesspayment: ImageVector? = null
