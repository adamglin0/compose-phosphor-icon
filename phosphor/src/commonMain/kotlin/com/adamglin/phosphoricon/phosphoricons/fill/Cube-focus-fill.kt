package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Cube-focus-fill`: ImageVector
    get() {
        if (`_cube-focus-fill` != null) {
            return `_cube-focus-fill`!!
        }
        `_cube-focus-fill` = Builder(name = "Cube-focus-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 48.0f)
                lineTo(232.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(216.0f, 56.0f)
                lineTo(184.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 48.0f)
                close()
                moveTo(72.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(72.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(224.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(32.0f)
                lineTo(184.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(232.0f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 160.0f)
                close()
                moveTo(32.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(40.0f, 56.0f)
                lineTo(72.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(32.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(24.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 96.0f)
                close()
                moveTo(177.92f, 83.31f)
                lineTo(132.0f, 57.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.94f, 0.0f)
                lineTo(78.08f, 83.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 7.0f)
                lineTo(128.0f, 118.79f)
                lineToRelative(49.92f, -28.53f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 177.92f, 83.31f)
                close()
                moveTo(64.0f, 107.53f)
                lineTo(64.0f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 68.0f, 167.0f)
                lineToRelative(46.0f, 26.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, -3.47f)
                lineTo(120.0f, 132.64f)
                lineTo(70.0f, 104.06f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 64.0f, 107.53f)
                close()
                moveTo(192.0f, 160.0f)
                lineTo(192.0f, 107.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, -3.47f)
                lineToRelative(-50.0f, 28.58f)
                verticalLineToRelative(57.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, 3.47f)
                lineTo(188.0f, 167.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 160.0f)
                close()
            }
        }
        .build()
        return `_cube-focus-fill`!!
    }

private var `_cube-focus-fill`: ImageVector? = null
