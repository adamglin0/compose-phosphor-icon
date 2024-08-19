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

public val FillGroup.`Address-book-tabs-fill`: ImageVector
    get() {
        if (`_address-book-tabs-fill` != null) {
            return `_address-book-tabs-fill`!!
        }
        `_address-book-tabs-fill` = Builder(name = "Address-book-tabs-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(184.0f, 48.0f)
                horizontalLineToRelative(24.0f)
                lineTo(208.0f, 88.0f)
                lineTo(184.0f, 88.0f)
                close()
                moveTo(184.0f, 104.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(48.0f)
                lineTo(184.0f, 152.0f)
                close()
                moveTo(146.0f, 175.75f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.74f, -5.76f)
                curveToRelative(-2.63f, -10.26f, -13.06f, -18.0f, -24.25f, -18.0f)
                reflectiveCurveToRelative(-21.61f, 7.74f, -24.25f, 18.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.5f, -4.0f)
                arcToRelative(39.84f, 39.84f, 0.0f, false, true, 17.19f, -23.34f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 45.12f, 0.0f)
                arcTo(39.76f, 39.76f, 0.0f, false, true, 151.75f, 166.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 146.0f, 175.75f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(184.0f, 208.0f)
                lineTo(184.0f, 168.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(128.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 120.0f)
                close()
            }
        }
        .build()
        return `_address-book-tabs-fill`!!
    }

private var `_address-book-tabs-fill`: ImageVector? = null
