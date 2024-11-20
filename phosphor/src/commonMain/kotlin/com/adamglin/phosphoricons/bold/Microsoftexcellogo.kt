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

public val BoldGroup.MicrosoftExcelLogo: ImageVector
    get() {
        if (_microsoftExcelLogo != null) {
            return _microsoftExcelLogo!!
        }
        _microsoftExcelLogo = Builder(name = "MicrosoftExcelLogo", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 20.0f)
                lineTo(72.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 52.0f, 40.0f)
                lineTo(52.0f, 56.0f)
                lineTo(36.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 16.0f, 76.0f)
                lineTo(16.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(52.0f, 200.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 20.0f)
                close()
                moveTo(168.0f, 108.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(40.0f)
                lineTo(168.0f, 148.0f)
                close()
                moveTo(196.0f, 84.0f)
                lineTo(168.0f, 84.0f)
                lineTo(168.0f, 76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(148.0f, 44.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(76.0f, 44.0f)
                horizontalLineToRelative(48.0f)
                lineTo(124.0f, 56.0f)
                lineTo(76.0f, 56.0f)
                close()
                moveTo(40.0f, 80.0f)
                lineTo(144.0f, 80.0f)
                verticalLineToRelative(96.0f)
                lineTo(40.0f, 176.0f)
                close()
                moveTo(76.0f, 200.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(12.0f)
                lineTo(76.0f, 212.0f)
                close()
                moveTo(148.0f, 212.0f)
                lineTo(148.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(64.32f, 161.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.54f, -16.9f)
                lineTo(76.38f, 128.0f)
                lineToRelative(-13.6f, -16.32f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 81.22f, 96.32f)
                lineTo(92.0f, 109.25f)
                lineToRelative(10.78f, -12.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.44f, 15.36f)
                lineTo(107.62f, 128.0f)
                lineToRelative(13.6f, 16.32f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -18.44f, 15.36f)
                lineTo(92.0f, 146.75f)
                lineTo(81.22f, 159.68f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.9f, 1.54f)
                close()
            }
        }
        .build()
        return _microsoftExcelLogo!!
    }

private var _microsoftExcelLogo: ImageVector? = null
