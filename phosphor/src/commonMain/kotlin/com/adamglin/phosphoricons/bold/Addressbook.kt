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

public val BoldGroup.AddressBook: ImageVector
    get() {
        if (_addressBook != null) {
            return _addressBook!!
        }
        _addressBook = Builder(name = "AddressBook", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 20.0f)
                lineTo(64.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 40.0f)
                lineTo(44.0f, 60.0f)
                lineTo(32.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(44.0f, 84.0f)
                verticalLineToRelative(32.0f)
                lineTo(32.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(44.0f, 140.0f)
                verticalLineToRelative(32.0f)
                lineTo(32.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(44.0f, 196.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 20.0f)
                close()
                moveTo(204.0f, 212.0f)
                lineTo(68.0f, 212.0f)
                lineTo(68.0f, 44.0f)
                lineTo(204.0f, 44.0f)
                close()
                moveTo(100.8f, 171.37f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 70.4f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.6f, -16.32f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -19.21f, -14.68f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -67.19f, 0.0f)
                arcToRelative(72.12f, 72.12f, 0.0f, false, false, -19.2f, 14.68f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.6f, 16.32f)
                close()
                moveTo(116.0f, 112.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 116.0f, 112.0f)
                close()
            }
        }
        .build()
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
