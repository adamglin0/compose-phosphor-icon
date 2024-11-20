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

public val LightGroup.AddressBookTabs: ImageVector
    get() {
        if (_addressBookTabs != null) {
            return _addressBookTabs!!
        }
        _addressBookTabs = Builder(name = "AddressBookTabs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 34.0f)
                lineTo(48.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(190.0f, 102.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(52.0f)
                lineTo(190.0f, 154.0f)
                close()
                moveTo(210.0f, 48.0f)
                lineTo(210.0f, 90.0f)
                lineTo(190.0f, 90.0f)
                lineTo(190.0f, 46.0f)
                horizontalLineToRelative(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 210.0f, 48.0f)
                close()
                moveTo(46.0f, 208.0f)
                lineTo(46.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(178.0f, 46.0f)
                lineTo(178.0f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 208.0f)
                close()
                moveTo(208.0f, 210.0f)
                lineTo(190.0f, 210.0f)
                lineTo(190.0f, 166.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(42.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 208.0f, 210.0f)
                close()
                moveTo(149.81f, 166.51f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 131.23f, 143.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -38.45f, 0.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 74.19f, 166.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.62f, 3.0f)
                curveTo(88.67f, 158.38f, 99.93f, 150.0f, 112.0f, 150.0f)
                reflectiveCurveToRelative(23.34f, 8.38f, 26.19f, 19.49f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.62f, -3.0f)
                close()
                moveTo(94.0f, 120.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 94.0f, 120.0f)
                close()
            }
        }
        .build()
        return _addressBookTabs!!
    }

private var _addressBookTabs: ImageVector? = null
