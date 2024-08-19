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

public val DuotoneGroup.`Sword-duotone`: ImageVector
    get() {
        if (`_sword-duotone` != null) {
            return `_sword-duotone`!!
        }
        `_sword-duotone` = Builder(name = "Sword-duotone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(141.66f, 201.0f)
                lineTo(129.0f, 213.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineTo(92.0f, 188.0f)
                lineTo(58.35f, 221.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineTo(34.34f, 209.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.31f)
                lineTo(68.0f, 164.0f)
                lineTo(42.34f, 138.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f)
                lineTo(55.0f, 114.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(75.3f, 75.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 141.66f, 201.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 32.0f)
                lineTo(152.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.34f, 3.12f)
                lineToRelative(-64.0f, 83.21f)
                lineTo(72.0f, 108.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.64f, 0.0f)
                lineToRelative(-12.69f, 12.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f)
                lineToRelative(20.0f, 20.0f)
                lineToRelative(-28.0f, 28.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f)
                lineToRelative(12.69f, 12.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 0.0f)
                lineToRelative(28.0f, -28.0f)
                lineToRelative(20.0f, 20.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.64f, 0.0f)
                lineToRelative(12.69f, -12.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f)
                lineToRelative(-9.64f, -9.64f)
                lineToRelative(83.21f, -64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 104.0f)
                lineTo(224.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 32.0f)
                close()
                moveTo(52.69f, 216.0f)
                lineTo(40.0f, 203.32f)
                lineToRelative(28.0f, -28.0f)
                lineTo(80.68f, 188.0f)
                close()
                moveTo(123.3f, 208.0f)
                lineTo(48.0f, 132.71f)
                lineTo(60.7f, 120.0f)
                lineTo(136.0f, 195.31f)
                close()
                moveTo(208.0f, 100.06f)
                lineToRelative(-81.74f, 62.88f)
                lineTo(115.32f, 152.0f)
                lineToRelative(50.34f, -50.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.31f)
                lineTo(104.0f, 140.68f)
                lineTo(93.07f, 129.74f)
                lineTo(155.94f, 48.0f)
                lineTo(208.0f, 48.0f)
                close()
            }
        }
        .build()
        return `_sword-duotone`!!
    }

private var `_sword-duotone`: ImageVector? = null
