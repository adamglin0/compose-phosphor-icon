package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.AddressBookTabs: ImageVector
    get() {
        if (_addressBookTabs != null) {
            return _addressBookTabs!!
        }
        _addressBookTabs = Builder(name = "AddressBookTabs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(188.0f, 108.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(40.0f)
                lineTo(188.0f, 148.0f)
                close()
                moveTo(204.0f, 84.0f)
                lineTo(188.0f, 84.0f)
                lineTo(188.0f, 52.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(52.0f, 52.0f)
                lineTo(164.0f, 52.0f)
                lineTo(164.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                close()
                moveTo(188.0f, 204.0f)
                lineTo(188.0f, 172.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(151.62f, 165.0f)
                arcToRelative(43.22f, 43.22f, 0.0f, false, false, -15.16f, -23.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -56.92f, 0.0f)
                arcToRelative(43.35f, 43.35f, 0.0f, false, false, -15.16f, 23.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 23.24f, 6.0f)
                curveToRelative(2.2f, -8.54f, 11.0f, -15.0f, 20.38f, -15.0f)
                reflectiveCurveToRelative(18.19f, 6.44f, 20.38f, 15.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 23.24f, -6.0f)
                close()
                moveTo(96.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 120.0f)
                close()
            }
        }
        .build()
        return _addressBookTabs!!
    }

private var _addressBookTabs: ImageVector? = null
