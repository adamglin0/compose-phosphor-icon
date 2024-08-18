package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Cheese: ImageVector
    get() {
        if (_cheese != null) {
            return _cheese!!
        }
        _cheese = Builder(name = "Cheese", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 32.0f)
                arcToRelative(7.81f, 7.81f, 0.0f, false, false, -2.3f, 0.34f)
                lineToRelative(-160.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(16.08f, 16.08f, 0.0f, false, true, 16.0f, 15.69f)
                arcTo(15.6f, 15.6f, 0.0f, false, true, 43.42f, 147.0f)
                arcToRelative(16.87f, 16.87f, 0.0f, false, true, -12.0f, 5.05f)
                lineTo(24.0f, 152.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(224.0f, 200.05f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 88.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 184.0f, 32.0f)
                close()
                moveTo(185.12f, 48.0f)
                arcToRelative(40.06f, 40.06f, 0.0f, false, true, 38.07f, 32.0f)
                lineTo(78.51f, 80.0f)
                close()
                moveTo(192.0f, 104.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -46.62f, -8.0f)
                horizontalLineToRelative(45.24f)
                arcTo(23.86f, 23.86f, 0.0f, false, true, 192.0f, 104.0f)
                close()
                moveTo(88.0f, 184.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f)
                close()
                moveTo(224.0f, 184.0f)
                lineTo(152.0f, 184.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f)
                lineTo(32.0f, 184.0f)
                lineTo(32.0f, 168.0f)
                arcToRelative(33.0f, 33.0f, 0.0f, false, false, 22.84f, -9.85f)
                arcTo(31.39f, 31.39f, 0.0f, false, false, 64.0f, 135.38f)
                arcTo(32.15f, 32.15f, 0.0f, false, false, 32.0f, 104.0f)
                lineTo(32.0f, 96.0f)
                horizontalLineToRelative(96.81f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 78.38f, 0.0f)
                lineTo(224.0f, 96.0f)
                close()
            }
        }
        .build()
        return _cheese!!
    }

private var _cheese: ImageVector? = null
