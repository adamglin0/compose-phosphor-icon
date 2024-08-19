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

public val RegularGroup.Bridge: ImageVector
    get() {
        if (_bridge != null) {
            return _bridge!!
        }
        _bridge = Builder(name = "Bridge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 160.0f)
                lineTo(200.0f, 160.0f)
                lineTo(200.0f, 101.34f)
                arcToRelative(71.89f, 71.89f, 0.0f, false, false, 29.0f, 21.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.0f, -14.83f)
                arcTo(55.78f, 55.78f, 0.0f, false, true, 200.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 72.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(55.78f, 55.78f, 0.0f, false, true, -35.0f, 51.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.0f, 14.83f)
                arcToRelative(71.89f, 71.89f, 0.0f, false, false, 29.0f, -21.42f)
                lineTo(56.0f, 160.0f)
                lineTo(24.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(56.0f, 176.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(72.0f, 176.0f)
                lineTo(184.0f, 176.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(200.0f, 176.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(144.0f, 126.2f)
                lineTo(144.0f, 160.0f)
                lineTo(112.0f, 160.0f)
                lineTo(112.0f, 126.2f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 32.0f, 0.0f)
                close()
                moveTo(72.0f, 101.2f)
                arcToRelative(72.47f, 72.47f, 0.0f, false, false, 24.0f, 19.27f)
                lineTo(96.0f, 160.0f)
                lineTo(72.0f, 160.0f)
                close()
                moveTo(160.0f, 160.0f)
                lineTo(160.0f, 120.48f)
                arcToRelative(72.47f, 72.47f, 0.0f, false, false, 24.0f, -19.27f)
                lineTo(184.0f, 160.0f)
                close()
            }
        }
        .build()
        return _bridge!!
    }

private var _bridge: ImageVector? = null
