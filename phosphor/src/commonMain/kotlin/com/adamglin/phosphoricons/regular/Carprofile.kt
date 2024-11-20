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

public val RegularGroup.CarProfile: ImageVector
    get() {
        if (_carProfile != null) {
            return _carProfile!!
        }
        _carProfile = Builder(name = "CarProfile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 112.0f)
                lineTo(211.31f, 112.0f)
                lineTo(168.0f, 68.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 156.69f, 64.0f)
                lineTo(44.28f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 31.0f, 71.12f)
                lineTo(1.34f, 115.56f)
                arcTo(8.07f, 8.07f, 0.0f, false, false, 0.0f, 120.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(33.0f, 184.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 62.0f, 0.0f)
                horizontalLineToRelative(66.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 62.0f, 0.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(256.0f, 128.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 240.0f, 112.0f)
                close()
                moveTo(44.28f, 80.0f)
                lineTo(156.69f, 80.0f)
                lineToRelative(32.0f, 32.0f)
                lineTo(23.0f, 112.0f)
                close()
                moveTo(64.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 192.0f)
                close()
                moveTo(192.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 192.0f, 192.0f)
                close()
                moveTo(240.0f, 168.0f)
                lineTo(223.0f, 168.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -62.0f, 0.0f)
                lineTo(95.0f, 168.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -62.0f, 0.0f)
                lineTo(16.0f, 168.0f)
                lineTo(16.0f, 128.0f)
                lineTo(240.0f, 128.0f)
                close()
            }
        }
        .build()
        return _carProfile!!
    }

private var _carProfile: ImageVector? = null
