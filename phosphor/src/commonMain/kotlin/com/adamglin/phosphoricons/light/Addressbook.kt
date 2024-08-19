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

public val LightGroup.Addressbook: ImageVector
    get() {
        if (_addressbook != null) {
            return _addressbook!!
        }
        _addressbook = Builder(name = "Addressbook", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(159.11f, 142.13f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, -46.22f, 0.0f)
                arcTo(65.75f, 65.75f, 0.0f, false, false, 83.2f, 164.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, 7.2f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, true, 86.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, -7.2f)
                arcTo(65.75f, 65.75f, 0.0f, false, false, 159.11f, 142.13f)
                close()
                moveTo(110.0f, 112.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 110.0f, 112.0f)
                close()
                moveTo(208.0f, 26.0f)
                lineTo(64.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 40.0f)
                lineTo(50.0f, 66.0f)
                lineTo(32.0f, 66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 78.0f)
                verticalLineToRelative(44.0f)
                lineTo(32.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 134.0f)
                verticalLineToRelative(44.0f)
                lineTo(32.0f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 190.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 26.0f)
                close()
                moveTo(210.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(64.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(62.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _addressbook!!
    }

private var _addressbook: ImageVector? = null
