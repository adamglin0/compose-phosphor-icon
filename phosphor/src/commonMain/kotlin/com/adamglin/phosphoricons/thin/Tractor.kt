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

public val ThinGroup.Tractor: ImageVector
    get() {
        if (_tractor != null) {
            return _tractor!!
        }
        _tractor = Builder(name = "Tractor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 166.87f)
                lineTo(236.0f, 134.0f)
                arcToRelative(11.92f, 11.92f, 0.0f, false, false, -8.55f, -11.49f)
                lineToRelative(-0.11f, 0.0f)
                lineTo(188.0f, 111.77f)
                lineTo(188.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(37.61f)
                lineToRelative(-32.0f, -8.67f)
                lineTo(148.0f, 52.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(40.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(52.0f, 52.0f)
                lineTo(52.0f, 92.0f)
                lineTo(40.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(68.0f, 100.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, 72.0f, 72.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 56.0f, -21.13f)
                close()
                moveTo(68.0f, 92.0f)
                lineTo(60.0f, 92.0f)
                lineTo(60.0f, 52.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(85.15f)
                arcTo(80.1f, 80.1f, 0.0f, false, false, 68.0f, 92.0f)
                close()
                moveTo(148.0f, 180.0f)
                lineTo(148.0f, 109.23f)
                lineToRelative(77.19f, 20.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 134.0f)
                verticalLineToRelative(26.36f)
                arcTo(31.71f, 31.71f, 0.0f, false, false, 212.0f, 156.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, false, -31.0f, 24.0f)
                close()
                moveTo(212.0f, 212.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 212.0f, 212.0f)
                close()
                moveTo(68.0f, 124.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, 48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 68.0f, 124.0f)
                close()
                moveTo(68.0f, 212.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 68.0f, 212.0f)
                close()
                moveTo(76.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 76.0f, 172.0f)
                close()
            }
        }
        .build()
        return _tractor!!
    }

private var _tractor: ImageVector? = null
