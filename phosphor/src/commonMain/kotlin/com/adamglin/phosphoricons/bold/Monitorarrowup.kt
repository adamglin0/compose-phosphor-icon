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

public val BoldGroup.MonitorArrowUp: ImageVector
    get() {
        if (_monitorArrowUp != null) {
            return _monitorArrowUp!!
        }
        _monitorArrowUp = Builder(name = "MonitorArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 176.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(208.0f, 204.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(236.0f, 64.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(212.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(172.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(96.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 228.0f)
                close()
                moveTo(160.49f, 103.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(140.0f, 117.0f)
                verticalLineToRelative(35.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 117.0f)
                lineToRelative(-3.51f, 3.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                close()
            }
        }
        .build()
        return _monitorArrowUp!!
    }

private var _monitorArrowUp: ImageVector? = null
