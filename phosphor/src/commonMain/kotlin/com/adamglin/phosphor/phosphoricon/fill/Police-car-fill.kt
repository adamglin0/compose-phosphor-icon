package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Police-car-fill`: ImageVector
    get() {
        if (`_police-car-fill` != null) {
            return `_police-car-fill`!!
        }
        `_police-car-fill` = Builder(name = "Police-car-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(104.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 24.0f)
                close()
                moveTo(248.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(192.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineToRelative(-8.0f)
                lineTo(80.0f, 192.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 120.0f)
                lineTo(16.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(27.36f, 104.0f)
                lineTo(54.75f, 56.06f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 68.64f, 48.0f)
                lineTo(187.36f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 13.89f, 8.06f)
                lineTo(228.64f, 104.0f)
                lineTo(240.0f, 104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 112.0f)
                close()
                moveTo(88.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(56.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(80.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 144.0f)
                close()
                moveTo(208.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(176.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 144.0f)
                close()
                moveTo(210.21f, 104.0f)
                lineTo(187.36f, 64.0f)
                lineTo(68.64f, 64.0f)
                lineTo(45.79f, 104.0f)
                close()
            }
        }
        .build()
        return `_police-car-fill`!!
    }

private var `_police-car-fill`: ImageVector? = null
