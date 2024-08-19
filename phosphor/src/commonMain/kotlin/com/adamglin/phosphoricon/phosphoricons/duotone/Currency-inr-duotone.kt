package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Currency-inr-duotone`: ImageVector
    get() {
        if (`_currency-inr-duotone` != null) {
            return `_currency-inr-duotone`!!
        }
        `_currency-inr-duotone` = Builder(name = "Currency-inr-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 92.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, 52.0f)
                horizontalLineTo(72.0f)
                verticalLineTo(40.0f)
                horizontalLineToRelative(36.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 160.0f, 92.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(167.85f)
                curveToRelative(0.09f, 1.32f, 0.15f, 2.65f, 0.15f, 4.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, true, -60.0f, 60.0f)
                horizontalLineTo(92.69f)
                lineToRelative(72.69f, 66.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.76f, 11.84f)
                lineToRelative(-88.0f, -80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 136.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, -44.0f)
                curveToRelative(0.0f, -1.35f, -0.07f, -2.68f, -0.19f, -4.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(75.17f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 108.0f, 48.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(148.74f)
                arcToRelative(60.13f, 60.13f, 0.0f, false, true, 15.82f, 24.0f)
                horizontalLineTo(200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_currency-inr-duotone`!!
    }

private var `_currency-inr-duotone`: ImageVector? = null
