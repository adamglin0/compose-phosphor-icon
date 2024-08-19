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

public val FillGroup.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = Builder(name = "Binoculars", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.22f, 151.9f)
                lineToRelative(0.0f, -0.1f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, false, -0.07f, -0.22f)
                arcToRelative(48.46f, 48.46f, 0.0f, false, false, -2.31f, -5.3f)
                lineTo(193.27f, 51.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.67f, -2.44f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 55.0f)
                lineTo(144.0f, 80.0f)
                lineTo(112.0f, 80.0f)
                lineTo(112.0f, 55.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.67f, 2.44f)
                lineTo(21.2f, 146.28f)
                arcToRelative(48.46f, 48.46f, 0.0f, false, false, -2.31f, 5.3f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, false, -0.07f, 0.21f)
                reflectiveCurveToRelative(0.0f, 0.08f, 0.0f, 0.11f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 90.32f, 32.51f)
                arcToRelative(47.49f, 47.49f, 0.0f, false, false, 2.9f, -16.59f)
                lineTo(112.04f, 96.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(71.83f)
                arcToRelative(47.49f, 47.49f, 0.0f, false, false, 2.9f, 16.59f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 90.32f, -32.51f)
                close()
                moveTo(94.07f, 178.9f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -60.2f, -21.71f)
                lineToRelative(1.81f, -4.13f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 167.88f)
                lineTo(96.0f, 168.0f)
                horizontalLineToRelative(0.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 94.07f, 178.94f)
                close()
                moveTo(203.0f, 198.07f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 168.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.11f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 60.32f, -14.78f)
                lineToRelative(1.81f, 4.13f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 203.0f, 198.07f)
                close()
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
