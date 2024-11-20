package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.DesktopTower: ImageVector
    get() {
        if (_desktopTower != null) {
            return _desktopTower!!
        }
        _desktopTower = Builder(name = "DesktopTower", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 76.0f)
                lineTo(120.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 192.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(15.73f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, 8.25f, 7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.53f)
                lineTo(64.27f, 224.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 56.0f, 216.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 64.0f, 208.0f)
                lineTo(80.0f, 208.0f)
                lineTo(80.0f, 192.0f)
                lineTo(32.0f, 192.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 8.0f, 168.0f)
                lineTo(8.0f, 96.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 32.0f, 72.0f)
                horizontalLineToRelative(84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 120.0f, 76.0f)
                close()
                moveTo(248.0f, 48.0f)
                lineTo(248.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(152.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(136.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 248.0f, 48.0f)
                close()
                moveTo(203.9f, 181.57f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -10.34f, 10.33f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 203.9f, 181.57f)
                close()
                moveTo(224.0f, 103.47f)
                arcTo(8.18f, 8.18f, 0.0f, false, false, 215.73f, 96.0f)
                lineTo(168.27f, 96.0f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, -8.25f, 7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.53f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 103.47f)
                close()
                moveTo(224.0f, 71.47f)
                arcTo(8.18f, 8.18f, 0.0f, false, false, 215.73f, 64.0f)
                lineTo(168.27f, 64.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, false, 160.0f, 71.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 80.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 71.47f)
                close()
            }
        }
        .build()
        return _desktopTower!!
    }

private var _desktopTower: ImageVector? = null
