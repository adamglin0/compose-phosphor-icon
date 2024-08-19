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

public val DuotoneGroup.`Airplane-duotone`: ImageVector
    get() {
        if (`_airplane-duotone` != null) {
            return `_airplane-duotone`!!
        }
        `_airplane-duotone` = Builder(name = "Airplane-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(152.0f, 152.0f)
                verticalLineToRelative(32.0f)
                lineToRelative(16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                lineToRelative(-40.0f, -16.0f)
                lineTo(88.0f, 232.0f)
                verticalLineTo(200.0f)
                lineToRelative(16.0f, -16.0f)
                verticalLineTo(152.0f)
                lineTo(24.0f, 168.0f)
                verticalLineTo(136.0f)
                lineToRelative(80.0f, -40.0f)
                verticalLineTo(48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f)
                verticalLineTo(96.0f)
                lineToRelative(80.0f, 40.0f)
                verticalLineToRelative(32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.58f, 128.84f)
                lineTo(160.0f, 91.06f)
                verticalLineTo(48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                verticalLineTo(91.06f)
                lineTo(20.42f, 128.84f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 136.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.57f, 7.84f)
                lineTo(96.0f, 161.76f)
                verticalLineToRelative(18.93f)
                lineTo(82.34f, 194.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 200.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.0f, 7.43f)
                lineToRelative(37.0f, -14.81f)
                lineToRelative(37.0f, 14.81f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 232.0f)
                verticalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f)
                lineTo(160.0f, 180.69f)
                verticalLineTo(161.76f)
                lineToRelative(70.43f, 14.08f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 168.0f)
                verticalLineTo(136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 235.58f, 128.84f)
                close()
                moveTo(224.0f, 158.24f)
                lineToRelative(-70.43f, -14.08f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 152.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.34f, 5.66f)
                lineTo(160.0f, 203.31f)
                verticalLineToRelative(16.87f)
                lineToRelative(-29.0f, -11.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.94f, 0.0f)
                lineTo(96.0f, 220.18f)
                verticalLineTo(203.31f)
                lineToRelative(13.66f, -13.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 184.0f)
                verticalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.57f, -7.84f)
                lineTo(32.0f, 158.24f)
                verticalLineToRelative(-17.3f)
                lineToRelative(75.58f, -37.78f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 96.0f)
                verticalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.42f, 7.16f)
                lineTo(224.0f, 140.94f)
                close()
            }
        }
        .build()
        return `_airplane-duotone`!!
    }

private var `_airplane-duotone`: ImageVector? = null
