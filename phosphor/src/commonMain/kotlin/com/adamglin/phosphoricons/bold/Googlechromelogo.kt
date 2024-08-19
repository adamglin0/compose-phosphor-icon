package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Googlechromelogo: ImageVector
    get() {
        if (_googlechromelogo != null) {
            return _googlechromelogo!!
        }
        _googlechromelogo = Builder(name = "Googlechromelogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(83.89f, 83.89f, 0.0f, false, true, 65.9f, 32.0f)
                lineTo(128.0f, 76.0f)
                arcToRelative(52.05f, 52.05f, 0.0f, false, false, -46.15f, 28.07f)
                lineTo(64.18f, 73.47f)
                arcTo(83.82f, 83.82f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(156.0f, 128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 156.0f, 128.0f)
                close()
                moveTo(44.0f, 128.0f)
                arcToRelative(83.41f, 83.41f, 0.0f, false, true, 6.0f, -31.11f)
                lineTo(83.0f, 154.0f)
                curveToRelative(0.06f, 0.11f, 0.14f, 0.2f, 0.2f, 0.3f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 128.0f, 180.0f)
                quadToRelative(1.19f, 0.0f, 2.34f, -0.06f)
                lineToRelative(-17.68f, 30.63f)
                arcTo(84.12f, 84.12f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(140.05f, 211.12f)
                lineTo(173.0f, 154.0f)
                curveToRelative(0.09f, -0.15f, 0.16f, -0.3f, 0.24f, -0.46f)
                arcTo(51.81f, 51.81f, 0.0f, false, false, 171.78f, 100.0f)
                horizontalLineToRelative(35.4f)
                arcToRelative(83.95f, 83.95f, 0.0f, false, true, -67.13f, 111.12f)
                close()
            }
        }
        .build()
        return _googlechromelogo!!
    }

private var _googlechromelogo: ImageVector? = null
