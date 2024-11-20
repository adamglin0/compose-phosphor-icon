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

public val FillGroup.HardHat: ImageVector
    get() {
        if (_hardHat != null) {
            return _hardHat!!
        }
        _hardHat = Builder(name = "HardHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 152.0f)
                lineTo(104.0f, 152.0f)
                lineTo(104.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
                moveTo(224.0f, 168.0f)
                lineTo(32.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-8.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 168.0f)
                close()
                moveTo(224.0f, 148.0f)
                lineTo(224.0f, 136.0f)
                arcToRelative(96.44f, 96.44f, 0.0f, false, false, -50.11f, -84.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 168.0f, 55.22f)
                lineTo(168.0f, 152.0f)
                horizontalLineToRelative(52.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 148.0f)
                close()
                moveTo(36.0f, 152.0f)
                lineTo(88.0f, 152.0f)
                lineTo(88.0f, 55.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.89f, -3.53f)
                arcTo(96.44f, 96.44f, 0.0f, false, false, 32.0f, 136.0f)
                verticalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 36.0f, 152.0f)
                close()
            }
        }
        .build()
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
