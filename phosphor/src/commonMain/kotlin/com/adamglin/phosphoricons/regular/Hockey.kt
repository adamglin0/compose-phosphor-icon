package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Hockey: ImageVector
    get() {
        if (_hockey != null) {
            return _hockey!!
        }
        _hockey = Builder(name = "Hockey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 152.0f)
                lineTo(130.9f, 152.0f)
                lineTo(38.1f, 42.82f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 25.9f, 53.18f)
                lineTo(159.51f, 210.36f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 171.7f, 216.0f)
                lineTo(224.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 168.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 152.0f)
                close()
                moveTo(144.5f, 168.0f)
                lineTo(192.0f, 168.0f)
                verticalLineToRelative(32.0f)
                lineTo(171.7f, 200.0f)
                close()
                moveTo(224.0f, 200.0f)
                lineTo(208.0f, 200.0f)
                lineTo(208.0f, 168.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(112.18f, 179.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.27f, 0.91f)
                lineTo(84.3f, 200.0f)
                lineTo(64.0f, 200.0f)
                lineTo(64.0f, 168.0f)
                lineTo(85.2f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(32.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(84.3f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.19f, -5.64f)
                lineToRelative(16.61f, -19.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.18f, 179.55f)
                close()
                moveTo(32.0f, 168.0f)
                lineTo(48.0f, 168.0f)
                verticalLineToRelative(32.0f)
                lineTo(32.0f, 200.0f)
                close()
                moveTo(149.9f, 122.82f)
                lineTo(217.9f, 42.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.2f, 10.36f)
                lineToRelative(-68.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.2f, -10.36f)
                close()
            }
        }
        .build()
        return _hockey!!
    }

private var _hockey: ImageVector? = null
