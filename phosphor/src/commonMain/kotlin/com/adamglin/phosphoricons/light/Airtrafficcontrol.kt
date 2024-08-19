package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Airtrafficcontrol: ImageVector
    get() {
        if (_airtrafficcontrol != null) {
            return _airtrafficcontrol!!
        }
        _airtrafficcontrol = Builder(name = "Airtrafficcontrol", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.47f, 72.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 66.0f)
                lineTo(134.0f, 66.0f)
                lineTo(134.0f, 30.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(104.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(18.0f)
                lineTo(122.0f, 66.0f)
                lineTo(40.0f, 66.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.84f, 84.78f)
                lineToRelative(26.19f, 72.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 66.18f, 166.0f)
                lineTo(98.0f, 166.0f)
                verticalLineToRelative(66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(110.0f, 166.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(158.0f, 166.0f)
                horizontalLineToRelative(31.82f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 203.0f, 156.78f)
                lineToRelative(26.19f, -72.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 227.47f, 72.0f)
                close()
                moveTo(109.0f, 154.0f)
                lineTo(95.19f, 78.0f)
                horizontalLineToRelative(65.62f)
                lineTo(147.0f, 154.0f)
                close()
                moveTo(64.3f, 152.68f)
                lineToRelative(-26.18f, -72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.24f, -1.83f)
                arcTo(1.94f, 1.94f, 0.0f, false, true, 40.0f, 78.0f)
                lineTo(83.0f, 78.0f)
                lineToRelative(13.82f, 76.0f)
                lineTo(66.18f, 154.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 64.3f, 152.68f)
                close()
                moveTo(217.88f, 80.68f)
                lineTo(191.7f, 152.68f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.88f, 1.32f)
                lineTo(159.19f, 154.0f)
                lineTo(173.0f, 78.0f)
                horizontalLineToRelative(43.0f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, true, 1.64f, 0.85f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 217.88f, 80.68f)
                close()
            }
        }
        .build()
        return _airtrafficcontrol!!
    }

private var _airtrafficcontrol: ImageVector? = null
