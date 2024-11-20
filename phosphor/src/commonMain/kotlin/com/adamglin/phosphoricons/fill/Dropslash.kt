package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) {
            return _dropSlash!!
        }
        _dropSlash = Builder(name = "DropSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineToRelative(-12.9f, -14.19f)
                arcTo(87.71f, 87.71f, 0.0f, false, true, 128.0f, 232.0f)
                curveToRelative(-48.0f, 0.0f, -87.49f, -38.93f, -88.0f, -86.88f)
                curveToRelative(-0.27f, -24.34f, 8.22f, -49.84f, 24.73f, -74.81f)
                lineTo(42.3f, 45.63f)
                arcToRelative(8.23f, 8.23f, 0.0f, false, true, 0.14f, -11.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.48f, 0.37f)
                close()
                moveTo(203.85f, 175.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.7f, -1.27f)
                arcTo(87.66f, 87.66f, 0.0f, false, false, 216.0f, 144.0f)
                curveToRelative(0.0f, -31.4f, -14.51f, -64.68f, -42.0f, -96.25f)
                arcToRelative(254.19f, 254.19f, 0.0f, false, false, -41.45f, -38.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.18f, 0.0f)
                arcTo(251.26f, 251.26f, 0.0f, false, false, 87.17f, 42.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.41f)
                close()
            }
        }
        .build()
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
