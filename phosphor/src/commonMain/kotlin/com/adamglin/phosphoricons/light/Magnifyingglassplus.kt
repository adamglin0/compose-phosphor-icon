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

public val LightGroup.Magnifyingglassplus: ImageVector
    get() {
        if (_magnifyingglassplus != null) {
            return _magnifyingglassplus!!
        }
        _magnifyingglassplus = Builder(name = "Magnifyingglassplus", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(150.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(118.0f, 118.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(106.0f, 118.0f)
                lineTo(80.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(26.0f)
                lineTo(106.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(26.0f)
                horizontalLineToRelative(26.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 150.0f, 112.0f)
                close()
                moveTo(228.24f, 228.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineToRelative(-51.38f, -51.38f)
                arcToRelative(86.15f, 86.15f, 0.0f, true, true, 8.48f, -8.48f)
                lineToRelative(51.38f, 51.38f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 228.24f, 228.24f)
                close()
                moveTo(112.0f, 186.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, true, false, -74.0f, -74.0f)
                arcTo(74.09f, 74.09f, 0.0f, false, false, 112.0f, 186.0f)
                close()
            }
        }
        .build()
        return _magnifyingglassplus!!
    }

private var _magnifyingglassplus: ImageVector? = null
