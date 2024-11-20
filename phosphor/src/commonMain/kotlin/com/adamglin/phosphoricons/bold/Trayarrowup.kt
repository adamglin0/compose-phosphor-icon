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

public val BoldGroup.TrayArrowUp: ImageVector
    get() {
        if (_trayArrowUp != null) {
            return _trayArrowUp!!
        }
        _trayArrowUp = Builder(name = "TrayArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 52.0f)
                verticalLineToRelative(92.0f)
                lineTo(179.31f, 144.0f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, -14.14f, 5.86f)
                lineTo(147.0f, 168.0f)
                lineTo(109.0f, 168.0f)
                lineTo(90.83f, 149.86f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 76.69f, 144.0f)
                lineTo(52.0f, 144.0f)
                lineTo(52.0f, 52.0f)
                close()
                moveTo(52.0f, 204.0f)
                lineTo(52.0f, 168.0f)
                lineTo(75.0f, 168.0f)
                lineToRelative(18.14f, 18.14f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 107.31f, 192.0f)
                horizontalLineToRelative(41.38f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 14.14f, -5.86f)
                lineTo(181.0f, 168.0f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(36.0f)
                close()
                moveTo(87.51f, 116.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(140.0f, 105.0f)
                verticalLineToRelative(35.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 105.0f)
                lineToRelative(-11.51f, 11.52f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 87.51f, 116.49f)
                close()
            }
        }
        .build()
        return _trayArrowUp!!
    }

private var _trayArrowUp: ImageVector? = null
