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

public val ThinGroup.Simcard: ImageVector
    get() {
        if (_simcard != null) {
            return _simcard!!
        }
        _simcard = Builder(name = "Simcard", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.83f, 85.17f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 152.0f, 28.0f)
                lineTo(56.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                lineTo(44.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 210.83f, 85.17f)
                close()
                moveTo(204.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(94.35f)
                lineTo(204.0f, 89.66f)
                close()
                moveTo(76.0f, 120.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(180.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(80.0f, 116.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 76.0f, 120.0f)
                close()
                moveTo(84.0f, 124.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(64.0f)
                lineTo(148.0f, 188.0f)
                lineTo(148.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(36.0f)
                lineTo(116.0f, 188.0f)
                lineTo(116.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(36.0f)
                lineTo(84.0f, 188.0f)
                close()
            }
        }
        .build()
        return _simcard!!
    }

private var _simcard: ImageVector? = null
