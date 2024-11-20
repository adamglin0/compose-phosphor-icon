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

public val ThinGroup.Jeep: ImageVector
    get() {
        if (_jeep != null) {
            return _jeep!!
        }
        _jeep = Builder(name = "Jeep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 92.0f)
                lineTo(227.23f, 92.0f)
                lineToRelative(-10.0f, -46.51f)
                arcTo(12.07f, 12.07f, 0.0f, false, false, 205.53f, 36.0f)
                lineTo(50.47f, 36.0f)
                arcToRelative(12.07f, 12.07f, 0.0f, false, false, -11.74f, 9.49f)
                lineTo(28.77f, 92.0f)
                lineTo(16.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(28.0f, 100.0f)
                lineTo(28.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(64.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(76.0f, 172.0f)
                lineTo(180.0f, 172.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 100.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(46.56f, 47.16f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 50.47f, 44.0f)
                lineTo(205.53f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.91f, 3.16f)
                lineTo(219.05f, 92.0f)
                lineTo(37.0f, 92.0f)
                close()
                moveTo(68.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 172.0f)
                lineTo(68.0f, 172.0f)
                close()
                moveTo(216.0f, 204.0f)
                lineTo(192.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(188.0f, 172.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 204.0f)
                close()
                moveTo(220.0f, 164.0f)
                lineTo(148.0f, 164.0f)
                lineTo(148.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(36.0f)
                lineTo(116.0f, 164.0f)
                lineTo(116.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(36.0f)
                lineTo(36.0f, 164.0f)
                lineTo(36.0f, 100.0f)
                lineTo(220.0f, 100.0f)
                close()
                moveTo(60.0f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 60.0f, 132.0f)
                close()
                moveTo(180.0f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 180.0f, 132.0f)
                close()
            }
        }
        .build()
        return _jeep!!
    }

private var _jeep: ImageVector? = null
