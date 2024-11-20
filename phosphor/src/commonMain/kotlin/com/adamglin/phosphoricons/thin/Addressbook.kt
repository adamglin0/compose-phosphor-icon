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

public val ThinGroup.AddressBook: ImageVector
    get() {
        if (_addressBook != null) {
            return _addressBook!!
        }
        _addressBook = Builder(name = "AddressBook", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.7f, 142.75f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -37.4f, 0.0f)
                arcTo(63.61f, 63.61f, 0.0f, false, false, 84.8f, 165.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.4f, 4.8f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 89.6f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.4f, -4.8f)
                arcTo(63.65f, 63.65f, 0.0f, false, false, 154.7f, 142.75f)
                close()
                moveTo(108.0f, 112.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 108.0f, 112.0f)
                close()
                moveTo(208.0f, 28.0f)
                lineTo(64.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 40.0f)
                lineTo(52.0f, 68.0f)
                lineTo(32.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(52.0f, 76.0f)
                verticalLineToRelative(48.0f)
                lineTo(32.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(52.0f, 132.0f)
                verticalLineToRelative(48.0f)
                lineTo(32.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(52.0f, 188.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(212.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(64.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(60.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
