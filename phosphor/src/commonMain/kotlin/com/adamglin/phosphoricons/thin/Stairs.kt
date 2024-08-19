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

public val ThinGroup.Stairs: ImageVector
    get() {
        if (_stairs != null) {
            return _stairs!!
        }
        _stairs = Builder(name = "Stairs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 28.0f)
                lineTo(56.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                lineTo(44.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 28.0f)
                close()
                moveTo(152.0f, 140.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(32.0f)
                lineTo(108.0f, 172.0f)
                lineTo(108.0f, 140.0f)
                close()
                moveTo(156.0f, 132.0f)
                lineTo(156.0f, 100.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(56.0f, 36.0f)
                lineTo(200.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(204.0f, 92.0f)
                lineTo(152.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(36.0f)
                lineTo(104.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(36.0f)
                lineTo(52.0f, 172.0f)
                lineTo(52.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 56.0f, 36.0f)
                close()
                moveTo(200.0f, 220.0f)
                lineTo(56.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 180.0f)
                lineTo(204.0f, 180.0f)
                verticalLineToRelative(36.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 220.0f)
                close()
            }
        }
        .build()
        return _stairs!!
    }

private var _stairs: ImageVector? = null
