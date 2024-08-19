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

public val LightGroup.Bookopentext: ImageVector
    get() {
        if (_bookopentext != null) {
            return _bookopentext!!
        }
        _bookopentext = Builder(name = "Bookopentext", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 50.0f)
                lineTo(160.0f, 50.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -32.0f, 17.55f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 96.0f, 50.0f)
                lineTo(24.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(18.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(96.0f, 206.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, -26.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(238.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 232.0f, 50.0f)
                close()
                moveTo(96.0f, 194.0f)
                lineTo(30.0f, 194.0f)
                lineTo(30.0f, 62.0f)
                lineTo(96.0f, 62.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                lineTo(122.0f, 204.31f)
                arcTo(37.86f, 37.86f, 0.0f, false, false, 96.0f, 194.0f)
                close()
                moveTo(226.0f, 194.0f)
                lineTo(160.0f, 194.0f)
                arcToRelative(37.87f, 37.87f, 0.0f, false, false, -26.0f, 10.32f)
                lineTo(134.0f, 88.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, -26.0f)
                horizontalLineToRelative(66.0f)
                close()
                moveTo(160.0f, 90.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(160.0f, 102.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                close()
                moveTo(206.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(160.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 206.0f, 128.0f)
                close()
                moveTo(206.0f, 160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(160.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 206.0f, 160.0f)
                close()
            }
        }
        .build()
        return _bookopentext!!
    }

private var _bookopentext: ImageVector? = null
