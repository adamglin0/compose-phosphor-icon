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

public val ThinGroup.Addressbooktabs: ImageVector
    get() {
        if (_addressbooktabs != null) {
            return _addressbooktabs!!
        }
        _addressbooktabs = Builder(name = "Addressbooktabs", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(188.0f, 100.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(56.0f)
                lineTo(188.0f, 156.0f)
                close()
                moveTo(212.0f, 48.0f)
                lineTo(212.0f, 92.0f)
                lineTo(188.0f, 92.0f)
                lineTo(188.0f, 44.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 48.0f)
                close()
                moveTo(44.0f, 208.0f)
                lineTo(44.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(180.0f, 44.0f)
                lineTo(180.0f, 212.0f)
                lineTo(48.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 208.0f)
                close()
                moveTo(208.0f, 212.0f)
                lineTo(188.0f, 212.0f)
                lineTo(188.0f, 164.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 212.0f)
                close()
                moveTo(147.88f, 167.0f)
                arcToRelative(36.24f, 36.24f, 0.0f, false, false, -20.44f, -23.67f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -30.88f, 0.0f)
                arcTo(36.28f, 36.28f, 0.0f, false, false, 76.13f, 167.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 79.0f, 171.87f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, 1.0f, 0.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.87f, -3.0f)
                curveTo(87.0f, 157.0f, 99.05f, 148.0f, 112.0f, 148.0f)
                reflectiveCurveToRelative(25.05f, 9.0f, 28.12f, 21.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.76f, -2.0f)
                close()
                moveTo(92.0f, 120.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 92.0f, 120.0f)
                close()
            }
        }
        .build()
        return _addressbooktabs!!
    }

private var _addressbooktabs: ImageVector? = null
