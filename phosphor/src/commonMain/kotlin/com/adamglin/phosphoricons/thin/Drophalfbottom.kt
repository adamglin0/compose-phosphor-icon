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

public val ThinGroup.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) {
            return _dropHalfBottom!!
        }
        _dropHalfBottom = Builder(name = "DropHalfBottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.0f, 50.37f)
                arcToRelative(250.18f, 250.18f, 0.0f, false, false, -40.73f, -37.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.58f, 0.0f)
                arcTo(250.18f, 250.18f, 0.0f, false, false, 85.0f, 50.37f)
                curveTo(58.17f, 81.21f, 44.0f, 113.58f, 44.0f, 144.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                curveTo(212.0f, 113.58f, 197.83f, 81.21f, 171.0f, 50.37f)
                close()
                moveTo(189.91f, 188.0f)
                horizontalLineTo(66.09f)
                arcToRelative(75.63f, 75.63f, 0.0f, false, true, -11.4f, -24.0f)
                horizontalLineTo(201.31f)
                arcTo(75.63f, 75.63f, 0.0f, false, true, 189.91f, 188.0f)
                close()
                moveTo(53.0f, 156.0f)
                arcToRelative(75.41f, 75.41f, 0.0f, false, true, -1.0f, -12.0f)
                arcToRelative(93.38f, 93.38f, 0.0f, false, true, 0.79f, -12.0f)
                horizontalLineTo(203.21f)
                arcToRelative(93.38f, 93.38f, 0.0f, false, true, 0.79f, 12.0f)
                arcToRelative(75.41f, 75.41f, 0.0f, false, true, -1.0f, 12.0f)
                close()
                moveTo(90.9f, 55.77f)
                arcTo(254.0f, 254.0f, 0.0f, false, true, 128.0f, 21.0f)
                arcToRelative(254.0f, 254.0f, 0.0f, false, true, 37.1f, 34.81f)
                curveToRelative(14.37f, 16.55f, 31.0f, 40.61f, 36.77f, 68.23f)
                horizontalLineTo(54.13f)
                curveTo(59.93f, 96.38f, 76.53f, 72.32f, 90.9f, 55.77f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(75.77f, 75.77f, 0.0f, false, true, -55.35f, -24.0f)
                horizontalLineToRelative(110.7f)
                arcTo(75.77f, 75.77f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
