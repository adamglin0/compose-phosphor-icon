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

public val ThinGroup.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.0f, 35.0f)
                arcToRelative(23.83f, 23.83f, 0.0f, false, false, -33.66f, 0.0f)
                lineTo(21.17f, 209.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.93f, 6.72f)
                arcTo(156.23f, 156.23f, 0.0f, false, false, 58.4f, 220.0f)
                curveToRelative(39.41f, 0.0f, 72.27f, -15.08f, 94.78f, -29.6f)
                curveToRelative(31.21f, -20.14f, 49.23f, -43.0f, 50.0f, -43.91f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.32f, -5.29f)
                lineTo(179.67f, 118.0f)
                lineTo(229.0f, 68.63f)
                arcTo(23.84f, 23.84f, 0.0f, false, false, 229.0f, 35.0f)
                close()
                moveTo(194.59f, 144.27f)
                arcToRelative(222.43f, 222.43f, 0.0f, false, true, -46.0f, 39.55f)
                curveToRelative(-37.85f, 24.35f, -77.0f, 33.0f, -116.55f, 25.81f)
                lineTo(146.0f, 95.67f)
                close()
                moveTo(223.38f, 63.0f)
                lineTo(174.0f, 112.36f)
                lineTo(151.66f, 90.0f)
                lineTo(201.0f, 40.62f)
                arcTo(15.8f, 15.8f, 0.0f, false, true, 223.38f, 63.0f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
