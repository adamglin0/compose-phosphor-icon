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

public val BoldGroup.Handdeposit: ImageVector
    get() {
        if (_handdeposit != null) {
            return _handdeposit!!
        }
        _handdeposit = Builder(name = "Handdeposit", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(108.0f, 45.0f)
                lineToRelative(-7.51f, 7.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(28.0f, -28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(28.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 17.0f)
                lineTo(132.0f, 45.0f)
                verticalLineToRelative(83.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 120.0f, 140.0f)
                close()
                moveTo(196.0f, 121.52f)
                lineTo(196.0f, 96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(164.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(68.3f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.29f, 212.0f)
                curveToRelative(0.11f, 0.2f, 0.23f, 0.39f, 0.35f, 0.58f)
                lineToRelative(22.26f, 34.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 171.0f, 233.43f)
                lineToRelative(-22.0f, -33.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.0f, -7.77f)
                curveToRelative(0.11f, 0.2f, 0.23f, 0.39f, 0.36f, 0.58f)
                lineTo(174.0f, 208.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.0f, -6.57f)
                lineTo(196.0f, 154.0f)
                arcToRelative(70.66f, 70.66f, 0.0f, false, true, 16.0f, 44.61f)
                lineTo(212.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(236.0f, 198.65f)
                arcTo(94.91f, 94.91f, 0.0f, false, false, 196.0f, 121.52f)
                close()
                moveTo(76.0f, 76.0f)
                lineTo(64.0f, 76.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 96.0f)
                lineTo(44.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(68.0f, 100.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _handdeposit!!
    }

private var _handdeposit: ImageVector? = null
