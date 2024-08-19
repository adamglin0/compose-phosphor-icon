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

public val FillGroup.Bookopentext: ImageVector
    get() {
        if (_bookopentext != null) {
            return _bookopentext!!
        }
        _bookopentext = Builder(name = "Bookopentext", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 48.0f)
                lineTo(168.0f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(87.73f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, -8.0f)
                lineTo(120.0f, 80.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 88.0f, 48.0f)
                lineTo(24.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(16.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(96.0f, 208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 23.94f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 5.12f, 7.55f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 232.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(240.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 48.0f)
                close()
                moveTo(208.0f, 168.0f)
                lineTo(168.27f, 168.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -8.25f, -7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.53f)
                horizontalLineToRelative(39.73f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 8.25f, 7.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 168.0f)
                close()
                moveTo(208.0f, 136.0f)
                lineTo(168.27f, 136.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -8.25f, -7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.53f)
                horizontalLineToRelative(39.73f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 8.25f, 7.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 136.0f)
                close()
                moveTo(208.0f, 104.0f)
                lineTo(168.27f, 104.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 160.0f, 96.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 88.0f)
                horizontalLineToRelative(39.73f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 216.0f, 95.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 104.0f)
                close()
            }
        }
        .build()
        return _bookopentext!!
    }

private var _bookopentext: ImageVector? = null
