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

public val FillGroup.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) {
            return _cloudMoon!!
        }
        _cloudMoon = Builder(name = "CloudMoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 72.0f)
                arcToRelative(76.35f, 76.35f, 0.0f, false, false, -12.36f, 1.0f)
                arcTo(71.93f, 71.93f, 0.0f, false, false, 104.17f, 9.83f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.59f, 9.58f)
                arcTo(56.05f, 56.05f, 0.0f, false, true, 40.0f, 88.0f)
                arcToRelative(56.45f, 56.45f, 0.0f, false, true, -12.59f, -1.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.59f, 9.59f)
                arcToRelative(72.22f, 72.22f, 0.0f, false, false, 32.29f, 45.06f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 92.0f, 224.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, -152.0f)
                close()
                moveTo(37.37f, 104.0f)
                curveToRelative(0.87f, 0.0f, 1.75f, 0.0f, 2.63f, 0.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, false, 72.0f, -72.0f)
                curveToRelative(0.0f, -0.89f, 0.0f, -1.78f, 0.0f, -2.67f)
                arcToRelative(55.64f, 55.64f, 0.0f, false, true, 32.0f, 48.05f)
                arcTo(76.4f, 76.4f, 0.0f, false, false, 101.0f, 120.78f)
                arcToRelative(52.38f, 52.38f, 0.0f, false, false, -9.0f, -0.78f)
                arcToRelative(51.69f, 51.69f, 0.0f, false, false, -30.0f, 9.59f)
                arcTo(56.22f, 56.22f, 0.0f, false, true, 37.37f, 104.0f)
                close()
            }
        }
        .build()
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
