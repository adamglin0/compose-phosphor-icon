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

public val FillGroup.Pepper: ImageVector
    get() {
        if (_pepper != null) {
            return _pepper!!
        }
        _pepper = Builder(name = "Pepper", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(167.27f, 40.42f)
                arcTo(40.06f, 40.06f, 0.0f, false, false, 128.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 22.85f, 16.66f)
                arcTo(64.08f, 64.08f, 0.0f, false, false, 96.0f, 104.0f)
                curveToRelative(0.0f, 46.75f, -25.75f, 78.0f, -76.53f, 93.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.77f, 31.13f)
                arcTo(264.8f, 264.8f, 0.0f, false, false, 66.75f, 232.0f)
                curveToRelative(40.78f, 0.0f, 86.16f, -9.15f, 117.53f, -35.46f)
                curveTo(210.64f, 174.44f, 224.0f, 143.3f, 224.0f, 104.0f)
                horizontalLineToRelative(0.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 167.27f, 40.42f)
                close()
                moveTo(192.0f, 95.0f)
                lineTo(163.58f, 80.83f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f)
                lineTo(128.0f, 95.0f)
                lineToRelative(-13.37f, -6.68f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 90.74f, 0.0f)
                close()
            }
        }
        .build()
        return _pepper!!
    }

private var _pepper: ImageVector? = null
