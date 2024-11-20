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

public val ThinGroup.WarningDiamond: ImageVector
    get() {
        if (_warningDiamond != null) {
            return _warningDiamond!!
        }
        _warningDiamond = Builder(name = "WarningDiamond", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 136.0f)
                lineTo(124.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 164.0f)
                close()
                moveTo(236.0f, 128.0f)
                arcToRelative(11.87f, 11.87f, 0.0f, false, true, -3.5f, 8.45f)
                lineToRelative(-96.05f, 96.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.9f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-96.0f, -96.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -16.9f)
                lineToRelative(96.05f, -96.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.9f, 0.0f)
                lineToRelative(96.05f, 96.06f)
                arcTo(11.87f, 11.87f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(228.0f, 128.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.16f, -2.79f)
                lineTo(130.79f, 29.15f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.58f, 0.0f)
                lineToRelative(-96.0f, 96.06f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, 0.0f, 5.58f)
                lineToRelative(96.05f, 96.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.58f, 0.0f)
                lineToRelative(96.05f, -96.06f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 228.0f, 128.0f)
                close()
            }
        }
        .build()
        return _warningDiamond!!
    }

private var _warningDiamond: ImageVector? = null
