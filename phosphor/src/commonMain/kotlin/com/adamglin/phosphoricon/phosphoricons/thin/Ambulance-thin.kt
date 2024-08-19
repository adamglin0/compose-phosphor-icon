package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Ambulance-thin`: ImageVector
    get() {
        if (`_ambulance-thin` != null) {
            return `_ambulance-thin`!!
        }
        `_ambulance-thin` = Builder(name = "Ambulance-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(20.0f)
                lineTo(108.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(116.0f, 124.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(108.0f, 124.0f)
                lineTo(88.0f, 124.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 84.0f, 120.0f)
                close()
                moveTo(252.0f, 120.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(219.71f, 196.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -55.42f, 0.0f)
                lineTo(107.71f, 196.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -55.42f, 0.0f)
                lineTo(32.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(20.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 32.0f, 60.0f)
                lineTo(184.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(188.0f, 76.0f)
                horizontalLineToRelative(38.58f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.15f, 7.54f)
                lineToRelative(14.0f, 35.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 252.0f, 120.0f)
                close()
                moveTo(188.0f, 84.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(54.09f)
                lineTo(230.3f, 86.51f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 226.58f, 84.0f)
                close()
                moveTo(32.0f, 188.0f)
                lineTo(52.29f, 188.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 55.42f, 0.0f)
                horizontalLineToRelative(56.58f)
                arcTo(28.05f, 28.05f, 0.0f, false, true, 180.0f, 166.71f)
                lineTo(180.0f, 68.0f)
                lineTo(32.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(28.0f, 184.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 188.0f)
                close()
                moveTo(100.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 100.0f, 192.0f)
                close()
                moveTo(212.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 212.0f, 192.0f)
                close()
                moveTo(244.0f, 184.0f)
                lineTo(244.0f, 124.0f)
                lineTo(188.0f, 124.0f)
                verticalLineToRelative(40.29f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 219.71f, 188.0f)
                lineTo(240.0f, 188.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 244.0f, 184.0f)
                close()
            }
        }
        .build()
        return `_ambulance-thin`!!
    }

private var `_ambulance-thin`: ImageVector? = null
