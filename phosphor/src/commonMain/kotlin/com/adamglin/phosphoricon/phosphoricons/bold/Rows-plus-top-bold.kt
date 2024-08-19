package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Rows-plus-top-bold`: ImageVector
    get() {
        if (`_rows-plus-top-bold` != null) {
            return `_rows-plus-top-bold`!!
        }
        `_rows-plus-top-bold` = Builder(name = "Rows-plus-top-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 156.0f)
                lineTo(48.0f, 156.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 176.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 156.0f)
                close()
                moveTo(204.0f, 196.0f)
                lineTo(52.0f, 196.0f)
                lineTo(52.0f, 180.0f)
                lineTo(204.0f, 180.0f)
                close()
                moveTo(208.0f, 80.0f)
                lineTo(48.0f, 80.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 144.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 100.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 80.0f)
                close()
                moveTo(204.0f, 120.0f)
                lineTo(52.0f, 120.0f)
                lineTo(52.0f, 104.0f)
                lineTo(204.0f, 104.0f)
                close()
                moveTo(96.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(8.0f)
                lineTo(116.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 48.0f)
                horizontalLineToRelative(-8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 36.0f)
                close()
            }
        }
        .build()
        return `_rows-plus-top-bold`!!
    }

private var `_rows-plus-top-bold`: ImageVector? = null
