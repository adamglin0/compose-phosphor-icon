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

public val DuotoneGroup.`T-shirt-duotone`: ImageVector
    get() {
        if (`_t-shirt-duotone` != null) {
            return `_t-shirt-duotone`!!
        }
        `_t-shirt-duotone` = Builder(name = "T-shirt-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(247.11f, 78.77f)
                lineToRelative(-19.27f, 36.81f)
                arcToRelative(8.44f, 8.44f, 0.0f, false, true, -7.5f, 4.42f)
                lineTo(192.0f, 120.0f)
                lineTo(192.0f, 40.0f)
                lineToRelative(51.78f, 28.25f)
                arcTo(7.81f, 7.81f, 0.0f, false, true, 247.11f, 78.77f)
                close()
                moveTo(8.89f, 78.77f)
                lineTo(28.16f, 115.58f)
                arcToRelative(8.44f, 8.44f, 0.0f, false, false, 7.5f, 4.42f)
                lineTo(64.0f, 120.0f)
                lineTo(64.0f, 40.0f)
                lineTo(12.22f, 68.25f)
                arcTo(7.81f, 7.81f, 0.0f, false, false, 8.89f, 78.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.59f, 61.22f)
                lineTo(195.83f, 33.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 32.0f)
                lineTo(160.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(64.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.84f, 1.0f)
                lineTo(8.41f, 61.22f)
                arcTo(15.76f, 15.76f, 0.0f, false, false, 1.82f, 82.48f)
                lineToRelative(19.27f, 36.81f)
                arcTo(16.37f, 16.37f, 0.0f, false, false, 35.67f, 128.0f)
                lineTo(56.0f, 128.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(184.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(200.0f, 128.0f)
                horizontalLineToRelative(20.34f)
                arcToRelative(16.37f, 16.37f, 0.0f, false, false, 14.58f, -8.71f)
                lineToRelative(19.27f, -36.81f)
                arcTo(15.76f, 15.76f, 0.0f, false, false, 247.59f, 61.22f)
                close()
                moveTo(35.67f, 112.0f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.41f, -0.13f)
                lineTo(16.09f, 75.26f)
                lineTo(56.0f, 53.48f)
                lineTo(56.0f, 112.0f)
                close()
                moveTo(184.0f, 208.0f)
                lineTo(72.0f, 208.0f)
                lineTo(72.0f, 48.0f)
                horizontalLineToRelative(16.8f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 78.38f, 0.0f)
                lineTo(184.0f, 48.0f)
                close()
                moveTo(220.75f, 111.86f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.41f, 0.14f)
                lineTo(200.0f, 112.0f)
                lineTo(200.0f, 53.48f)
                lineToRelative(39.92f, 21.78f)
                close()
            }
        }
        .build()
        return `_t-shirt-duotone`!!
    }

private var `_t-shirt-duotone`: ImageVector? = null
