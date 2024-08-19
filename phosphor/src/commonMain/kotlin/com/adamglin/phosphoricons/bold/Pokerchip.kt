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

public val BoldGroup.Pokerchip: ImageVector
    get() {
        if (_pokerchip != null) {
            return _pokerchip!!
        }
        _pokerchip = Builder(name = "Pokerchip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 164.0f)
                close()
                moveTo(161.06f, 78.0f)
                arcTo(59.51f, 59.51f, 0.0f, false, false, 140.0f, 69.21f)
                lineTo(140.0f, 44.87f)
                arcToRelative(83.55f, 83.55f, 0.0f, false, true, 38.28f, 15.88f)
                close()
                moveTo(116.0f, 69.21f)
                arcTo(59.51f, 59.51f, 0.0f, false, false, 94.94f, 78.0f)
                lineTo(77.72f, 60.75f)
                arcTo(83.55f, 83.55f, 0.0f, false, true, 116.0f, 44.87f)
                close()
                moveTo(78.0f, 94.94f)
                arcTo(59.51f, 59.51f, 0.0f, false, false, 69.21f, 116.0f)
                lineTo(44.87f, 116.0f)
                arcTo(83.59f, 83.59f, 0.0f, false, true, 60.75f, 77.72f)
                close()
                moveTo(69.21f, 140.0f)
                arcTo(59.51f, 59.51f, 0.0f, false, false, 78.0f, 161.06f)
                lineTo(60.75f, 178.28f)
                arcTo(83.59f, 83.59f, 0.0f, false, true, 44.87f, 140.0f)
                close()
                moveTo(94.94f, 178.0f)
                arcTo(59.51f, 59.51f, 0.0f, false, false, 116.0f, 186.79f)
                verticalLineToRelative(24.34f)
                arcToRelative(83.55f, 83.55f, 0.0f, false, true, -38.28f, -15.88f)
                close()
                moveTo(140.0f, 186.79f)
                arcTo(59.51f, 59.51f, 0.0f, false, false, 161.06f, 178.0f)
                lineToRelative(17.22f, 17.22f)
                arcTo(83.55f, 83.55f, 0.0f, false, true, 140.0f, 211.13f)
                close()
                moveTo(178.0f, 161.06f)
                arcTo(59.51f, 59.51f, 0.0f, false, false, 186.79f, 140.0f)
                horizontalLineToRelative(24.34f)
                arcToRelative(83.59f, 83.59f, 0.0f, false, true, -15.88f, 38.28f)
                close()
                moveTo(186.79f, 116.0f)
                arcTo(59.51f, 59.51f, 0.0f, false, false, 178.0f, 94.94f)
                lineToRelative(17.22f, -17.22f)
                arcTo(83.59f, 83.59f, 0.0f, false, true, 211.13f, 116.0f)
                close()
            }
        }
        .build()
        return _pokerchip!!
    }

private var _pokerchip: ImageVector? = null
