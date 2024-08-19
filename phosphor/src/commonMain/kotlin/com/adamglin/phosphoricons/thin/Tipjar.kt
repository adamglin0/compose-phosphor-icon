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

public val ThinGroup.Tipjar: ImageVector
    get() {
        if (_tipjar != null) {
            return _tipjar!!
        }
        _tipjar = Builder(name = "Tipjar", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 52.23f)
                lineTo(180.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(88.0f, 20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 32.0f)
                lineTo(76.0f, 52.23f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 44.0f, 88.0f)
                lineTo(44.0f, 200.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(212.0f, 88.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 180.0f, 52.23f)
                close()
                moveTo(148.0f, 28.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(172.0f, 52.0f)
                lineTo(148.0f, 52.0f)
                close()
                moveTo(116.0f, 28.0f)
                horizontalLineToRelative(24.0f)
                lineTo(140.0f, 52.0f)
                lineTo(116.0f, 52.0f)
                close()
                moveTo(84.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(20.0f)
                lineTo(108.0f, 52.0f)
                lineTo(84.0f, 52.0f)
                close()
                moveTo(204.0f, 200.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(80.0f, 228.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(52.0f, 88.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 80.0f, 60.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                close()
                moveTo(156.0f, 160.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 180.0f)
                lineTo(112.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(120.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -40.0f)
                horizontalLineToRelative(4.0f)
                lineTo(124.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(120.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 156.0f, 160.0f)
                close()
            }
        }
        .build()
        return _tipjar!!
    }

private var _tipjar: ImageVector? = null
