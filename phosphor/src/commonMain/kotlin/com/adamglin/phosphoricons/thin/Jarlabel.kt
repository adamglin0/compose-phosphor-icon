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

public val ThinGroup.JarLabel: ImageVector
    get() {
        if (_jarLabel != null) {
            return _jarLabel!!
        }
        _jarLabel = Builder(name = "JarLabel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(52.0f, 108.0f)
                lineTo(204.0f, 108.0f)
                verticalLineToRelative(72.0f)
                lineTo(52.0f, 180.0f)
                close()
                moveTo(172.0f, 32.0f)
                lineTo(172.0f, 52.0f)
                lineTo(148.0f, 52.0f)
                lineTo(148.0f, 28.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 32.0f)
                close()
                moveTo(116.0f, 52.0f)
                lineTo(116.0f, 28.0f)
                horizontalLineToRelative(24.0f)
                lineTo(140.0f, 52.0f)
                close()
                moveTo(88.0f, 28.0f)
                horizontalLineToRelative(20.0f)
                lineTo(108.0f, 52.0f)
                lineTo(84.0f, 52.0f)
                lineTo(84.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 88.0f, 28.0f)
                close()
                moveTo(80.0f, 60.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                verticalLineToRelative(12.0f)
                lineTo(52.0f, 100.0f)
                lineTo(52.0f, 88.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 80.0f, 60.0f)
                close()
                moveTo(176.0f, 228.0f)
                lineTo(80.0f, 228.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(52.0f, 188.0f)
                lineTo(204.0f, 188.0f)
                verticalLineToRelative(12.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 176.0f, 228.0f)
                close()
            }
        }
        .build()
        return _jarLabel!!
    }

private var _jarLabel: ImageVector? = null
