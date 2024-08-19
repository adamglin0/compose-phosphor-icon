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

public val ThinGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.78f, 162.13f)
                lineTo(173.56f, 141.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 162.18f, 142.0f)
                arcToRelative(3.37f, 3.37f, 0.0f, false, false, -0.38f, 0.28f)
                lineTo(137.0f, 163.42f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, -3.7f, 0.21f)
                curveToRelative(-16.24f, -7.84f, -33.05f, -24.52f, -40.89f, -40.57f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.18f, -3.69f)
                lineToRelative(21.2f, -25.21f)
                curveToRelative(0.1f, -0.12f, 0.19f, -0.25f, 0.28f, -0.38f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.0f, -11.36f)
                lineTo(93.9f, 35.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.48f, -7.19f)
                arcTo(52.25f, 52.25f, 0.0f, false, false, 36.0f, 80.0f)
                curveToRelative(0.0f, 77.2f, 62.8f, 140.0f, 140.0f, 140.0f)
                arcToRelative(52.25f, 52.25f, 0.0f, false, false, 51.91f, -45.42f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 220.78f, 162.13f)
                close()
                moveTo(220.0f, 173.58f)
                arcTo(44.23f, 44.23f, 0.0f, false, true, 176.0f, 212.0f)
                curveTo(103.22f, 212.0f, 44.0f, 152.78f, 44.0f, 80.0f)
                arcTo(44.23f, 44.23f, 0.0f, false, true, 82.42f, 36.0f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, true, 0.48f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.67f, 2.49f)
                lineToRelative(21.11f, 47.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.23f, 3.6f)
                lineToRelative(-21.19f, 25.2f)
                curveToRelative(-0.1f, 0.13f, -0.2f, 0.25f, -0.29f, 0.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.78f, 11.75f)
                curveToRelative(8.69f, 17.79f, 26.61f, 35.58f, 44.6f, 44.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.79f, -0.87f)
                lineToRelative(0.37f, -0.28f)
                lineToRelative(24.83f, -21.12f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, 3.57f, -0.27f)
                lineToRelative(47.21f, 21.16f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 173.58f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
